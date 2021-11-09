// Random id
function randomId() {
    return Math.floor(Math.random() * 100000);
}

// Convert price
function convertPrice(number) {
    return number.toLocaleString("it-IT", {
        style: "currency",
        currency: "USD",
    });
}

// Khai báo danh sách sản phẩm
let products = [
    {
        id: randomId(),
        name: "Nguyễn Ngọc Phương Vy",
        description:
            "Không chỉ sở hữu gương mặt xinh xắn, dễ thương pha chút độ sang chảnh Phương Vy còn gây ấn tượng với chiều cao khủng của mình 1m70, với chiều cao và ngoại hình nổi bật của mình trong tương lai cô gái này rất có thể là một người mẫu đầy kỳ vọng của làng giải trí Việt Nam.",
        price: 2500.55,
        image: "https://icdn.dantri.com.vn/thumb_w/640/2019/12/20/diem-danh-12-hot-girl-noi-bat-nhat-nam-2019-docx-1576850955802.jpeg",
        count: 1,
    },
    {
        id: randomId(),
        name: "Chù Disturbia",
        description:
            "Chù Disturbia tên thật là Nguyễn Thị Vân Anh, là một hot girl, người mẫu ảnh, diễn viên trẻ đang thu hút sự quan tâm của công chúng. Vân Anh tốt nghiệp khoa Tài chính ngân hàng tại trường Đại học Tôn Đức Thắng. Cô từng làm cộng tác viên cho tạp chí Hoa Học Trò.",
        price: 3000.85,
        image: "https://scontent.fhan2-1.fna.fbcdn.net/v/t31.18172-8/23675055_10208161555196162_1964557728133256691_o.jpg?_nc_cat=101&ccb=1-5&_nc_sid=0debeb&_nc_ohc=C9GSgd9roA8AX8ITwME&_nc_ht=scontent.fhan2-1.fna&oh=b959d74840055fabbd8642e01ac03387&oe=61B0A9B8",
        count: 5,
    },
];

// Khai báo biến
const productsEle = document.querySelector(".products");

const subTotalEl = document.querySelector(".subtotal span");
const vatEl = document.querySelector(".vat span");
const totalEl = document.querySelector(".total span");

// Render và hiển thị dữ liệu
function renderProduct(arr) {
    productsEle.innerHTML = "";

    // Cập nhật số lượng sản phẩm trong giỏ hàng
    let countEl = document.querySelector(".count");
    countEl.innerText = `${updateTotalProduct(arr)} items in the bag`;

    // Tính tổng tiền
    updateTotalMoney(arr);

    // Trường hợp giỏ hàng rỗng (products = [])
    if (arr.length == 0) {
        productsEle.insertAdjacentHTML(
            "afterbegin",
            "<li>Không có sản phẩm nào trong giỏ hàng</li>"
        );
        document.querySelector(".option-container").style.display = "none";
        return;
    }

    for (let i = 0; i < arr.length; i++) {
        const p = arr[i];

        productsEle.innerHTML += `
            <li class="row">
                <div class="col left">
                    <div class="thumbnail">
                        <a href="#">
                            <img
                                src="${p.image}"
                                alt="${p.name}"
                            />
                        </a>
                    </div>
                    <div class="detail">
                        <div class="name">
                            <a href="#">${p.name}</a>
                        </div>
                        <div class="description">
                            ${p.description}
                        </div>
                        <div class="price">${convertPrice(p.price)}</div>
                    </div>
                </div>

                <div class="col right">
                    <div class="quantity">
                        <input
                            type="number"
                            class="quantity"
                            step="1"
                            value="${p.count}"
                            onchange="changeTotalProduct(${p.id}, event)"
                        />
                    </div>

                    <div class="remove">
                        <span class="close" onclick="removeProduct(${p.id})">
                            <i class="fa fa-times"aria-hidden="true"></i>
                        </span>
                    </div>
                </div>
            </li>
        `;
    }
}

// Cập nhật số lượng sản phẩm
function updateTotalProduct(arr) {
    let total = 0;
    for (let i = 0; i < arr.length; i++) {
        total += arr[i].count;
    }
    return total;
}

// Xóa sản phẩm
function removeProduct(id) {
    for (let i = 0; i < products.length; i++) {
        if (products[i].id == id) {
            // Thực hiện xóa products[i] ra khỏi mảng products
            products.splice(i, 1);
        }
    }
    renderProduct(products);
}

// Thay đổi số lượng sản phẩm
function changeTotalProduct(id, event) {
    for (let i = 0; i < products.length; i++) {
        if (products[i].id == id) {
            products[i].count = Number(event.target.value);
        }
    }
    renderProduct(products);
}

// Cập nhật tổng tiền
function updateTotalMoney(arr) {
    let totalMoney = 0;

    for (let i = 0; i < arr.length; i++) {
        totalMoney += arr[i].count * arr[i].price;
    }

    subTotalEl.innerText = convertPrice(totalMoney);
    vatEl.innerText = convertPrice(totalMoney * 0.05);
    totalEl.innerText = convertPrice(totalMoney * 1.05);
}

// --------------------------------------------------------------------------------

// Danh sách mã giảm giá
let promotionCode = {
    An: 100,
    AnhHien: 50,
    Java4: 40,
    NabJKs: 25,
};

const container = document.querySelector(".container");
const titleEl = container.querySelector("h1");
titleEl.innerText = "Giỏ hàng";

const promotionEl = document.querySelector(".promotion");
const promoCode = document.querySelector("#promo-code");
const promoCodeBtn = promotionEl.querySelector("button");
const discountEl = document.querySelector(".discount");

promoCodeBtn.addEventListener("click", () => {
    if (Object.keys(promotionCode).includes(promoCode.value)) {
        discountEl.classList.remove("hide");
        discountEl.querySelector("span").innerText = `${
            promotionCode[promoCode.value]
        }%`;

        let numberTotal = parseFloat(
            totalEl.innerText.slice(0, totalEl.innerText.indexOf("USD") - 1)
        );

        // console.log(
        //     promotionCode[`${promoCode.value}`],
        //     numberTotal,
        //     promotionCode[promoCode.value],
        //     numberTotal - (numberTotal * promotionCode[promoCode.value]) / 100
        // );

        totalEl.innerText = convertPrice(
            numberTotal - numberTotal * (promotionCode[promoCode.value] / 100)
        );

        delete promotionCode[`${promoCode.value}`];
        console.log("🚀 ~ promotionCode", promotionCode);
    }
});

window.onload = renderProduct(products);
