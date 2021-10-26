// Bài 1: Highlight tất cả các từ có độ dài lớn hơn hoặc bằng 8 ký tự trong đoạn văn (background = "yellow")
const p = document.querySelector("p");
p.innerHTML = p.innerHTML
    .split(" ")
    .map((i) =>
        i.replace(/[,\.!?']/g, "").length > 8
            ? `<b style="background-color : yellow">${i}</b>`
            : i
    )
    .join(" ");

// bài 2: Thêm link hiển thị text "facebook" link đến trang facebook.com ở sau thẻ p
const fb = document.createElement("a");
fb.href = "http://www.facebook.com";
fb.innerText = "facebook";
fb.target = "_blank";

document.body.appendChild(fb);

// bài 3. Đếm số từ có trong đoạn văn. Tạo 1 thẻ div để hiển thị số từ
const div = document.createElement("div");
div.innerText = `So tu: ${p.innerHTML.split(" ").length} tu`;

document.body.appendChild(div);

// Bài 4: thay thế các ký hiệu ? => 🤔, ! => 😲
p.innerHTML = p.innerHTML.replace(/\?/g, "🤔").replace(/\!/g, "😲");
