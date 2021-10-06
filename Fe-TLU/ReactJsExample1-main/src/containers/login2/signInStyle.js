import styled from "styled-components";

export const Wrapper = styled.div`
    width: 100vw;
    height: 100vh;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    background: gray;
`;

export const Box = styled.div`
    background-color: green;
    font-size: 16px;
    width: 19em;
    min-height: 5em;
    margin-bottom: 10em;
    display: flex;
    flex-direction: column;
    align-items: center;
`;

export const Title = styled.h2`
    color: black;
    text-align: center;
`;

export const Text = styled.h4`
    color: black;
    text-align: left;
    margin-bottom: 0;
`;

export const InputUserName = styled.input`
    width: 14em;
    height: 2em;
    border-radius: 0.2em;
    border: none;
`;

export const Row = styled.div`
    display: flex;
    flex-direction: row;
    justify-content: flex-start;
    align-items: center;
    margin-top: 1em;
`;

export const ButtonLogin = styled.div`
    background-color: #3bf7dd;
    font-size: 18px;
    font-weight: bold;
    margin-top: 1em;
    margin-bottom: 1em;
    padding: 0.5em 2em;
    border-radius: 0.3em;
`;
