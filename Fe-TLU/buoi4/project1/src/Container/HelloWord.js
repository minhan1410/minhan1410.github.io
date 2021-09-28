import React from 'react';
import {
    Wraper,Title
} from './helloWordStyle'

class HelloWord extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <Wraper> 
                May thay lag wa e k nhin dc
                <Title>
                    Hummmmm :((
                </Title>
            </Wraper>
        )
    }
}

export const x = 5;
export default HelloWord;