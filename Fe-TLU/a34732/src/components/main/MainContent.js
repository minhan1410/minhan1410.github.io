import React, { Component } from "react";
import Pagination from "@material-ui/lab/Pagination";
import { Wrapper, Blank, Sort } from "./mainContentStyle";
import Header from "./Header";
import Test from "./Test";

class MainContent extends Component {
    constructor(props) {
        super(props);
        this.state = {};
    }

    renderListItem() {
        const { listItem, currentPage, perPage } = this.props;
        const items = [];

        const currentList= listItem.slice(currentPage * perPage - perPage, currentPage * perPage);

        for (let i = 0; i < currentList.length; i++) {
            const item = (
                <Test
                    name={currentList[i].name}
                    point={currentList[i].point}
                    time={currentList[i].time}
                    diff={currentList[i].diff}
                    past={currentList[i].past}
                />
            );
            items.push(item);
        }
        return <Sort>{items}</Sort>;
    }

    render() {
        const {
            searchKeyword,
            sortFilter,
            currentPage,
            perPage,
            totalPages,
            searchOnClick,
            searchKeywordOnChange,
            sortFilterOnChange,
            listItem,
            OnChangePage,
        } = this.props;
        return (
            <Wrapper>
                <Header
                    searchKeyword={searchKeyword}
                    sortFilter={sortFilter}
                    searchOnClick={searchOnClick}
                    searchKeywordOnChange={searchKeywordOnChange}
                    sortFilterOnChange={sortFilterOnChange}
                />
                <Blank>{this.renderListItem()}</Blank>
                <Pagination
                    count={totalPages / perPage}
                    variant="outlined"
                    shape="rounded"
                    onChange={(event, value) => {
                        console.log("Change", value);
                        OnChangePage(value);
                    }}
                    style={{
                        marginBottom: "1em",
                    }}
                />
            </Wrapper>
        );
    }
}

export default MainContent;
