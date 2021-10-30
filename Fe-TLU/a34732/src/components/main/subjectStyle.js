import styled from "styled-components";

export const Wrapper = styled.div`
    width: 14em;
    margin-right: 1em;
    margin-top: 1em;
    padding: 0.5em;
    border-radius: 0.3em;
    border: gray 1px solid;
    display: flex;
    flex-direction: row;
`;

export const Row = styled.div`
    display: flex;
    flex-direction: row;
    justify-content: flex-start;
    font-weight: 400;
    font-size: 0.8em;
    color: #282828;
`;

export const Column = styled.div`
    display: flex;
    flex-direction: column;
    justify-content: flex-start;
    font-weight: 400;
    font-size: 0.8em;
    width: ${(props) => props.width};
`;

export const TitleField = styled.div`
    color: #303030;
    font-weight: bold;
    margin-right: 1em;
`;

export const CheckBox = styled.input`
    margin-right: 0.5em;
    margin-top: 0.5em;
`;

export const ButtonWrapper = styled.div`
    flex: 1;
    height: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
`;

export const ButtonStart = styled.button`
    font-size: 20px;
    font-weight: bold;
    border-radius: 0.5em;
    background: #e6e6fa;
`;

export const Star = styled.img`
    width: 1.25em;
    margin-left: 0.25em;
    margin-top: 0.5em;
`;
export const Star_not = styled.img`
    width: 1.25em;
    margin-left: 0.25em;
    filter: grayscale(100%);
    margin-top: 0.5em;
`;

export const RowLeft = styled.div`
    display: flex;
    justify-content: flex-start;
    align-items: center;
    flex-direction: row;
    width: 100%;
    margin-left: 10px;
`;
