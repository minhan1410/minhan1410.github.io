import React, { Component } from "react";
import Pagination from "@material-ui/lab/Pagination";
import { Wrapper, Blank, Sort } from "./mainContentStyle";
import Header from "./Header";
import Subject from "./Subject";

class MainContent extends Component {
    constructor(props) {
        super(props);
        this.state = {};
    }

    renderListItem() {
        const { listItem } = this.props;
        const items = [];
        for (let i = 0; i < listItem.length; i++) {
            const item = (
                <Subject
                    name={listItem[i].name}
                    point={listItem[i].point}
                    time={listItem[i].time}
                    diff={listItem[i].diff}
                    past={listItem[i].past}
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
                    count={10}
                    variant="outlined"
                    shape="rounded"
                    style={{
                        marginBottom: "1em",
                    }}
                />
            </Wrapper>
        );
    }
}

export default MainContent;
