function intit() {
    document.getElementById("name-0").innerText = "Lượt 1";
    document.getElementById("name-1").innerText = "Lượt 2";

    document.getElementById("score-0").innerText = 0;
    document.getElementById("score-1").innerText = 0;

    current = 0;
    document.getElementById("current-0").innerText = current;
    document.getElementById("current-1").innerText = current;

    document.getElementById("dice-1").style.display = "none";
    document.getElementById("dice-2").style.display = "none";

    active = 0;
    document.querySelector(".player-0-panel").classList.add("active");
    document.querySelector(".player-1-panel").classList.remove("active");

    document.querySelector(".btn-hold").disabled = false;
    document.querySelector(".btn-roll").disabled = false;
}
// onload: đc  kích hoạt khi trang web chạy xg HTML/CSS
window.onload = intit();

document.querySelector(".btn-roll").addEventListener("click", () => {
    console.log(
        "active: ",
        active,
        " - current: ",
        document.getElementById(`current-${active}`).innerText
    );

    document.getElementById("dice-1").style.display = "block";
    document.getElementById("dice-2").style.display = "block";

    let dice1 = Math.round(Math.random() * 1 + 1);
    let dice2 = Math.round(Math.random() * 1 + 1);

    console.log(dice1, " - ", dice2);

    document.getElementById("dice-1").src = `./img/dice-${dice1}.png`;
    document.getElementById("dice-2").src = `./img/dice-${dice2}.png`;

    current = parseInt(document.getElementById(`current-${active}`).innerText);

    if (dice1 == 1 && dice2 == 1) {
        document.getElementById(`current-${active}`).innerText = 0;

        document.getElementById("dice-1").style.display = "none";
        document.getElementById("dice-2").style.display = "none";

        document.querySelector(".player-0-panel").classList.toggle("active");
        document.querySelector(".player-1-panel").classList.toggle("active");

        active = document
            .querySelector(".player-0-panel")
            .classList.contains("active")
            ? 0
            : 1;
    } else {
        current += dice1 + dice2;
        document.getElementById(`current-${active}`).innerText = current;
    }
});

document.querySelector(".btn-hold").addEventListener("click", () => {
    console.log(
        "active: ",
        active,
        " - current: ",
        document.getElementById(`current-${active}`).innerText
    );

    current = parseInt(document.getElementById(`current-${active}`).innerText);
    score = document.getElementById(`score-${active}`);

    score.innerText = parseInt(score.innerText) + current;

    let final_score = document.querySelector(".final-score").value;
    let win_score = parseInt(final_score);
    console.log(score.innerText, " + ", win_score);

    document.getElementById(`current-${active}`).innerText = 0;

    document.getElementById("dice-1").style.display = "none";
    document.getElementById("dice-2").style.display = "none";

    if (parseInt(score.innerText) >= win_score) {
        document.getElementById(`name-${active}`).innerText = "Winner!";
        document
            .querySelector(`.player-${active}-panel`)
            .classList.add("winner");
        document.querySelector(".btn-hold").disabled = true;
        document.querySelector(".btn-roll").disabled = true;
    } else {
        document.querySelector(".player-0-panel").classList.toggle("active");
        document.querySelector(".player-1-panel").classList.toggle("active");
        active = document
            .querySelector(".player-0-panel")
            .classList.contains("active")
            ? 0
            : 1;
    }
});

document.querySelector(".btn-new").addEventListener("click", () => {
    document
        .querySelector(`.player-${active}-panel`)
        .classList.remove("winner");
    intit();
});
