import React , { Component } from 'react';
import Pagination from '@material-ui/lab/Pagination';
import {
    Wrapper, Blank, WrapperTests,
} from './mainContentStyle';
import Header from './Header';
import TestItem from './TestItem';

class MainContent extends Component {
  constructor(props) {
    super(props);
    this.state = {
    }
    console.log("data =", this.props.data)
  }

  renderTests () {
    const items = [];
    for(let i=0; i < this.props.data.length; i++) {
      const item = (
        <TestItem 
          name={this.props.data[i].name}
          point={this.props.data[i].point}
          time={this.props.data[i].time}
          diff={this.props.data[i].diff}
          past={this.props.data[i].past}
        />        
      )
      items.push(item);
    }
    return (
      <WrapperTests>
        {items}
      </WrapperTests>
    )
  }

  render() {
    return (
        <Wrapper >
            <Header
              keyWord={this.props.keyWord}
              searchOnChange={this.props.searchOnChange}
            />
            {
              this.renderTests()
            }
            <Pagination
              count={10}
              variant="outlined"
              shape="rounded"
              style={{
                marginBottom: '1em',
              }}
            />
        </Wrapper>
    )
  }
}

export default MainContent;
