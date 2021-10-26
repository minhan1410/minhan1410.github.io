import React , { Component } from 'react';
import Pagination from '@material-ui/lab/Pagination';
import {
    Wrapper, Blank,
} from './mainContentStyle';
import Header from './Header';


class MainContent extends Component {
  constructor(props) {
    super(props);
    this.state = {
    }
  }

  renderListItem() {
    const { listItem } = this.props;
    const items = [];
    for(let i = 0; i < listItem.length; i ++) {
      const item = <div>{listItem[i].name + " - " + listItem[i].point + " - " + listItem[i].time} </div>
      items.push(item);
    }
    return items;
  }

  render() {
    const {
      searchKeyword,
      sortFilter,
      currentPage,
      perPage,
      totalPage,
      searchOnClick,
      searchKeywordOnChange,
      sortFilterOnChange,
      listItem,
    } = this.props;
  
    return (
        <Wrapper >
            <Header
              searchKeyword={searchKeyword}
              sortFilter={sortFilter}
              searchOnClick={searchOnClick}
              searchKeywordOnChange={searchKeywordOnChange}
              sortFilterOnChange={sortFilterOnChange}
            />
            <Blank>
              { this.renderListItem() }
            </Blank>
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
