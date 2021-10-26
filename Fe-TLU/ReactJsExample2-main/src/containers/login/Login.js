import React , { Component } from 'react';
import {
    Wrapper, PopupLoginWrapper, Text, Row,
    Input, Button, Blank,
} from "./loginStyle";
import api from "../../services/api";
import StorageUtils from '../../helpers/StorageUtils';

class Login extends Component {
  constructor(props) {
    super(props);
    this.state = {
      userName: '',
      password: 0,
    }
    this.handleUserName1 = this.handleUserName.bind(this);
    this.handlePassword1 = this.handlePassword.bind(this);
  }

  login() {
    const params = {
        userName: this.state.userName,
        password: this.state.password,
    };

    api.create().login(params)
    .then(response => {
        const { data } = response;
        const { token } = data;
        console.log('token ', token);
        StorageUtils.setItem('token', token);
        window.location.replace('/');

    })
    .catch((error) => {
      const { message } = error;
      console.log('error: ', message);
    });
  }

  getUserInfo() {
    api.create().getUserInfo(16)
    .then(response => {
        console.log('response = ', response);
    })
    .catch((error) => {
      const { message } = error;
      console.log('error: ', message);
    });
  }

  handleUserName(event) {
    this.setState({ userName: event.target.value})
  }

  handlePassword(event) {
    this.setState({ password: event.target.value})
  }

  render() {
    return (
      <Wrapper>
        <PopupLoginWrapper>
          <Text color="#d3c8c8" fontSize={25}>LOGIN</Text>
          <Row>
            <Text color="#d3c8c8" fontSize={20}>User name</Text>
            <Input
              value={this.state.userName}
              onChange={this.handleUserName1}
            />
          </Row>
          <Blank height={0.2} />
          <Row>
            <Text color="#d3c8c8" fontSize={20}>Password</Text>
            <Input
              value={this.state.password}
              onChange={this.handlePassword1}
              type="password"
            />
          </Row>
          <Button onClick={() => this.login()}>Login</Button>
          <Button onClick={() => this.getUserInfo()}>getUserInfo</Button>
        </PopupLoginWrapper>
      </Wrapper>
    )
  }
}

export default Login;
