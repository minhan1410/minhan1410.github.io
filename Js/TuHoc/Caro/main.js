const canvas = document.getElementById("canvas");
const c = canvas.getContext("2d");

class Board {
    constructor(cellWidth, row, col) {
        this.cellWidth = cellWidth;
        this.row = row;
        this.col = col;

        canvas.width = this.col * this.cellWidth;
        canvas.height = this.row * this.cellWidth;

        this.data = [];
        this.create2DArray();
        this.xTurn = true;
    }

    create2DArray() {
        for (let i = 0; i < this.row; i++) {
            this.data[i] = [];
            for (let j = 0; j < this.col; j++) {
                this.data[i][j] = 0;
            }
        }
    }

    drawGrid() {
        c.lineWidth = 1;
        // Vẽ đường kẻ ngang
        for (let i = 0; i <= this.row; i++) {
            c.beginPath();
            if (i == 0 || i == this.row) {
                c.strokeStyle = "#FFF";
            } else {
                c.strokeStyle = "#9999CC";
            }
            c.moveTo(0, i * this.cellWidth);
            c.lineTo(this.col * this.cellWidth, i * this.cellWidth);
            c.stroke();
            c.closePath();
        }

        // Vẽ đường kẻ dọc
        for (let j = 0; j <= this.col; j++) {
            c.beginPath();
            if (j == 0 || j == this.col) {
                c.strokeStyle = "#FFF";
            } else {
                c.strokeStyle = "#6699FF";
            }
            c.moveTo(j * this.cellWidth, 0);
            c.lineTo(j * this.cellWidth, this.row * this.cellWidth);
            c.stroke();
            c.closePath();
        }
    }

    handleClick(e) {
        // Lấy ra tọa độ chuột dựa vào biến event trong hàm xử lý sự kiện
        let x = e.offsetX;
        let y = e.offsetY;

        // Quy đổi tọa độ chuột => Số hàng / Số cột
        let i = Math.floor(y / this.cellWidth);
        let j = Math.floor(x / this.cellWidth);

        // console.log(x, " - ", y);
        // console.log(i, " - ", j);

        // Nếu xTurn = true => Cập nhật vị trí tương ứng trong this.data = 1 (X đánh)
        // Nếu xTurn = flase => Cập nhật vị trí tương ứng trong this.data = 2 (O đánh)
        if (i >= 0 && j >= 0 && this.data[i][j] === 0) {
            if (this.xTurn) {
                this.data[i][j] = 1;
                this.drawX(i, j);
            } else {
                this.data[i][j] = 2;
                this.drawO(i, j);
            }
            this.xTurn = !this.xTurn;
        }
        console.log("🚀 ~ Board ~ handleClick ~ this.data", this.data);
        this.checkWin(i, j)
    }

    checkWin(i, j) {
        let turn = this.data[i][j];

        let checkRow = this.checkRow(i, j, turn);
        let checkCol = this.checkColumn(i, j, turn);
        let checkHuyen = this.checkCheoHuyen(i, j, turn);
        let checkSac = this.checkCheoSac(i, j, turn);

        if (
            checkRow == 5 ||
            checkCol == 5 ||
            checkHuyen == 5 ||
            checkSac == 5
        ) {
            const h1 = document.createElement('h1');
            h1.innerText = `${this.data[i][j] == 1 ? "X" : "O"} win`
            document.body.appendChild(h1);
        }
    }

    checkRow(i, j, turn) {
        let count = 0;

        for (let c = j; c < this.data[i].length; c++) {
            // console.log("Tien: ", i, " - ", c);
            if (this.data[i][c] == turn) {
                count++;
            } else {
                break;
            }
        }

        for (let c = j - 1; c >= 0; c--) {
            // console.log("lui: ", i, " - ", c);
            if (this.data[i][c] == turn) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }

    checkColumn(i, j, turn) {
        let count = 0;

        for (let r = i; r < this.data.length; r++) {
            // console.log("Tien: ", r, " - ", j);
            if (this.data[r][j] == turn) {
                count++;
            } else {
                break;
            }
        }

        for (let r = i - 1; r >= 0; r--) {
            // console.log("lui: ", r, " - ", j);
            if (this.data[r][j] == turn) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }

    checkCheoHuyen(i, j, turn) {
        let count = 0;

        for (
            let r = i, c = j;
            r < this.data.length && c < this.data[0].length;
            r++, c++
        ) {
            // console.log("Tien: ", r, " - ", c);

            if (this.data[r][c] == turn) {
                count++;
            } else {
                break;
            }
        }

        for (let r = i - 1, c = j - 1; r >= 0 && c >= 0; r--, c--) {
            // console.log("Lui: ", r, " - ", c);

            if (this.data[r][c] == turn) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }

    checkCheoSac(i, j, turn) {
        let count = 0;

        for (let r = i, c = j; r < this.data.length && c >= 0; r++, c--) {
            // console.log("Tien: ", r, " - ", c);

            if (this.data[r][c] == turn) {
                count++;
            } else {
                break;
            }
        }

        for (
            let r = i - 1, c = j + 1;
            r >= 0 && c <= this.data.length;
            r--, c++
        ) {
            // console.log("Lui: ", r, " - ", c);

            if (this.data[r][c] == turn) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    // drawXO() {
    //     for (let i = 0; i < this.data.length; i++) {
    //         for (let j = 0; j < this.data[0].length; j++) {
    //             if (this.data[i][j] === 1) {
    //                 this.drawX(i, j);
    //             } else if (this.data[i][j] === 2) {
    //                 this.drawO(i, j);
    //             }
    //         }
    //     }
    // }

    drawX(i, j) {
        let x = j * this.cellWidth;
        let y = i * this.cellWidth;

        c.strokeStyle = "#999999";
        c.lineWidth = 3;

        c.beginPath();
        c.moveTo(x + this.cellWidth * 0.2, y + this.cellWidth * 0.2);
        c.lineTo(x + this.cellWidth * 0.8, y + this.cellWidth * 0.8);
        c.stroke();
        c.closePath();

        c.beginPath();
        c.moveTo(x + this.cellWidth * 0.2, y + this.cellWidth * 0.8);
        c.lineTo(x + this.cellWidth * 0.8, y + this.cellWidth * 0.2);
        c.stroke();
        c.closePath();
    }

    drawO(i, j) {
        let x = j * this.cellWidth;
        let y = i * this.cellWidth;

        c.beginPath();
        c.strokeStyle = "#6699CC";
        c.lineWidth = 3;
        c.arc(
            x + this.cellWidth / 2,
            y + this.cellWidth / 2,
            this.cellWidth * 0.3,
            0,
            2 * Math.PI
        );
        c.stroke();
        c.closePath();
    }
}

const board = new Board(30, 23, 42);
// const board = new Board(30, 9, 10);
board.drawGrid();
canvas.addEventListener("click", function (e) {
    board.handleClick(e);
});

// function animate() {
//     requestAnimationFrame(animate);
//     c.clearRect(0, 0, canvas.width, canvas.height);
//     board.drawGrid();
//     board.drawXO();
// }

// animate();
