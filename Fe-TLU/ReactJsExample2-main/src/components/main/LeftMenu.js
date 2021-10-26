import React , { Component } from 'react';
import {
    Wrapper, Avata, TextField, ButtonLogout, Blank,
} from './leftMenuStyle';
import Images from '../../asset/images';


class LeftMenu extends Component {
  constructor(props) {
    super(props);
    this.state = {
    }
  }

  render() {
    const {
      username,
      totalPoint,
      testComplete,
      testNotComplete,
    } = this.props;
    return (
        <Wrapper id="LeftMenu">
            <Avata src={Images.avataDefault} alt="avata" />
            <TextField>{username}</TextField>
            <TextField>Point: {totalPoint}</TextField>
            <TextField>Test complete: {testComplete}</TextField>
            <TextField>Test not complete: {testNotComplete}</TextField>
            <Blank />
            <ButtonLogout>Log out</ButtonLogout>
        </Wrapper>
    )
  }
}

export default LeftMenu;
