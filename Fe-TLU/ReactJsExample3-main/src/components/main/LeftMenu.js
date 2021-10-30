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
    return (
        <Wrapper id="LeftMenu">
            <Avata src={Images.avataDefault} alt="avata" />
            <TextField>Name: Ny An</TextField>
            <TextField>Point: 2430</TextField>
            <TextField>Test complete: 29</TextField>
            <TextField>Test not complete: 42</TextField>
            <Blank />
            <ButtonLogout>Log out</ButtonLogout>
        </Wrapper>
    )
  }
}

export default LeftMenu;
