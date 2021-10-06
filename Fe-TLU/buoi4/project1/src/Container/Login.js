import React from "react";


class Login extends React.Component {
    constructor(props) {
        super(props);
    }


    render() {
        return (
            <div class="container">
                <h1>Registration Form</h1>
                <registrationForm>
                    <div class="form-input">
                        <input id="username" type="text"/>
                    </div>
                    <div class="form-input">
                        <input id="password" type="password"/>
                        <button>Hiện</button>
                    </div>
                    <div class="form-input">
                        <input id="confirmPassword" type="password"/>
                        <button>Hiện</button>
                    </div>
                    <button type="submit" id="btn">Register</button>
                </registrationForm>
            </div>
        );
    }
}

export default Login;