import React, { Component } from "react";
import {
    Wrapper,
    Row,
    TitleField,
    CheckBox,
    Column,
    ButtonWrapper,
    Star,
    Star_not,
    ButtonStart,
    RowLeft,
} from "./testStyle";
import Images from "../../asset/images";

class Test extends Component {
    constructor(props) {
        super(props);
    }
    renderStars() {
        const stars = [];
        for (let i = 0; i < this.props.diff; i++) {
            const item = <Star src={Images.star} />;
            stars.push(item);
        }
        for (let i = 0; i < 5 - this.props.diff; i++) {
            const item = <Star_not src={Images.star} />;
            stars.push(item);
        }
        return stars;
    }
    render() {
        return (
            <Wrapper>
                <Column width="70%">
                    <Row>
                        <TitleField>Name:</TitleField>
                        {this.props.name}
                    </Row>
                    <Row>
                        <TitleField>Time:</TitleField>
                        {this.props.time}
                    </Row>
                    <Row>
                        <TitleField>Point:</TitleField>
                        {this.props.point}
                    </Row>
                    <Row>
                        <TitleField>Diff:</TitleField>
                        {this.renderStars()}
                    </Row>
                    <Row>
                        <TitleField>Past:</TitleField>
                        <input
                            type="checkbox"
                            checked={this.props.past}
                        ></input>
                    </Row>
                </Column>
                <Column>
                    <ButtonStart>START</ButtonStart>
                </Column>
            </Wrapper>
        );
    }
}

export default Test;
