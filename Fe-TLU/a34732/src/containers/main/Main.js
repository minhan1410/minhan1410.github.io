import React, { Component } from "react";
import styled from "styled-components";
import MainContent from "../../components/main/MainContent";
import LeftMenu from "../../components/main/LeftMenu";
import { Filter } from "../../constant/main";
import api from "../../services/api";

export const Wrapper = styled.div`
    width: 100vw;
    height: 100vh;
    color: #f4f6f6;
    font-size: 23px;
    font-weight: bold;
    display: flex;
    background: gray;
    flex-direction: row;
    justify-content: flex-start;
    align-items: center;
`;

class Main extends Component {
    constructor(props) {
        super(props);
        const data = [];
        this.state = {
            userName: "Minh An",
            totalPoint: 0,
            testComplete: 0,
            testNotComplete: 0,

            searchKeyword: "",
            sortFilter: Filter.All,
            currentPage: 1,
            perPage: 9,
            totalPage: 10,

            listTest: data,
            listVisible: data,
        };
    }

    getInfoUser() {
        const { listTest } = this.state;
        let totalPoint = 0,
            testComplete = 0,
            testNotComplete = 0;
        for (let i of listTest) {
            if (i.past) {
                totalPoint += i.point;
                testComplete++;
            }
        }
        testNotComplete = listTest.length - testComplete;

        this.setState({
            totalPoint: totalPoint,
            testComplete: testComplete,
            testNotComplete: testNotComplete,
        });
    }

    componentDidMount() {
        console.log("Did mount");
        const { currentPage, perPage } = this.state;
        api.create()
            .fetchListTest(currentPage, perPage)
            .then((response) => {
                console.log("data = ", response);
                console.log(response.data.total);
                console.log(response.data.data.length);
                this.setState(
                    {
                        listTest: response.data.data,
                        totalPage: response.data.total,
                        perPage: response.data.perPage,
                    },
                    () => {
                        this.getVisible();
                        this.getInfoUser();
                    }
                );
            })
            .catch((error) => {
                const { message } = error;
                console.log("error: ", message);
            });
    }

    searchOnClick(key) {
        console.log("searchOnClick ", key);
        this.getVisible();
    }
    searchKeywordOnChange(key) {
        this.setState({ searchKeyword: key });
    }
    OnChangePage(key) {
        this.setState({ currentPage: key });
    }
    sortFilterOnChange(key) {
        this.setState({ sortFilter: key }, () => {
            this.getVisible();
        });
    }

    getVisible() {
        const { searchKeyword, sortFilter, listTest, currentPage } = this.state;
        const listVisible = [];
        for (let i = 0; i < listTest.length; i++) {
            if (
                listTest[i].name
                    .toLowerCase()
                    .includes(searchKeyword.toLowerCase())
            ) {
                listVisible.push(listTest[i]);
            }
        }
        if (sortFilter === Filter.Point) {
            listVisible.sort(function (a, b) {
                return a.point - b.point;
            });
        }
        if (sortFilter === Filter.Time) {
            listVisible.sort(function (a, b) {
                return a.time - b.time;
            });
        }
        this.setState({ listVisible: listVisible });
    }

    render() {
        const {
            userName,
            totalPoint,
            testComplete,
            testNotComplete,

            searchKeyword,
            sortFilter,
            currentPage,
            perPage,
            totalPage,
            listTest,
            listVisible,
        } = this.state;
        return (
            <Wrapper>
                <LeftMenu
                    userName={userName}
                    totalPoint={totalPoint}
                    testComplete={testComplete}
                    testNotComplete={testNotComplete}
                />

                <MainContent
                    searchKeyword={searchKeyword}
                    sortFilter={sortFilter}
                    currentPage={currentPage}
                    perPage={perPage}
                    totalPages={totalPage}
                    searchOnClick={(value) => this.searchOnClick(value)}
                    searchKeywordOnChange={(value) =>
                        this.searchKeywordOnChange(value)
                    }
                    sortFilterOnChange={(value) =>
                        this.sortFilterOnChange(value)
                    }
                    listItem={listVisible}
                    OnChangePage={value =>{
                        this.OnChangePage(value)
                    }}
                />
            </Wrapper>
        );
    }
}

export default Main;
