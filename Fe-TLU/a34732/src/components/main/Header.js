import React, { Component } from "react";
import {
    Wrapper,
    InputSearch,
    ButtonGoto,
    DropBox,
    Blank,
} from "./headerStyle";
import { Filter } from "../../constant/main";
class Header extends Component {
    constructor(props) {
        super(props);
        this.state = {
            keyWord: "",
        };
    }

    render() {
        const {
            searchOnClick,
            searchKeyword,
            sortFilter,
            searchKeywordOnChange,
            sortFilterOnChange,
        } = this.props;
        return (
            <Wrapper>
                <InputSearch
                    value={searchKeyword}
                    type="text"
                    onChange={(event) =>
                        searchKeywordOnChange(event.target.value)
                    }
                    placeholder="Nhập vào đây"
                />
                <ButtonGoto onClick={() => searchOnClick(searchKeyword)}>
                    GO TO
                </ButtonGoto>
                <Blank />
                <DropBox
                    name="filter"
                    id="filter"
                    value={sortFilter}
                    onChange={(event) => {
                        console.log("Change", event.target.value);
                        sortFilterOnChange(parseInt(event.target.value));
                    }}
                >
                    <option value={Filter.All}>All</option>
                    <option value={Filter.Time}>Time</option>
                    <option value={Filter.Point}>Point</option>
                </DropBox>
            </Wrapper>
        );
    }
}

export default Header;
