import React, { Component } from "react";
import {
    Wrapper,
    Box,
    Title,
    Text,
    InputUserName,
    Row,
    ButtonLogin,
} from "./signInStyle";

class SignIn extends Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <Wrapper>
                <Box>
                    <Title>Login</Title>
                    <div>
                        <div>
                            <Text>Ma Sinh Vien</Text>
                            <InputUserName />
                        </div>

                        <div>
                            <Text>Password</Text>
                            <InputUserName />
                        </div>
                        <Row>
                            <input type="checkbox"></input>
                            <span>Remember me</span>
                        </Row>
                    </div>
                    <ButtonLogin>Login</ButtonLogin>
                </Box>
            </Wrapper>
        );
    }
}

export default SignIn;
