import React , { Component } from 'react';
import styled from 'styled-components';

export const Wrapper = styled.div`
    width: 100vw;
    height: 100vh;
    color: #f4f6f6;
    font-size: 23px;
    font-weight: bold;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    background: gray;
`;

class Main extends Component {
  constructor(props) {
    super(props);
    this.state = {
      userName: '',
      password: 0,
    }
  }

  render() {
    return (
      <Wrapper>
        <div>Main page</div>
      </Wrapper>
    )
  }
}

export default Main;
