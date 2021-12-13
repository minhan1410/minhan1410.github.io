const $ = document.querySelector.bind(document);
const $$ = document.querySelectorAll.bind(document);

const playlist = $(".playlist");
const cd = $(".cd");

const app = {
    currentIndex: 0,

    songs: [
        {
            name: "Có Hẹn Với Thanh Xuân",
            singer: "MONSTAR",
            path: "https://zingmp3.vn/bai-hat/co-hen-voi-thanh-xuan-MONSTAR/ZUW9EB6F.html",
            image: "https://photo-resize-zmp3.zadn.vn/w240_r1x1_webp/cover/e/2/3/f/e23ff2faaa64eebfc57e0acde247f0db.jpg",
        },
        {
            name: "Đường Tôi Chở Em Về",
            singer: "buitruonglinh",
            path: "https://zingmp3.vn/bai-hat/Duong-Toi-Cho-Em-Ve-buitruonglinh/ZWBIEWBI.html",
            image: "https://photo-resize-zmp3.zadn.vn/w240_r1x1_webp/cover/4/0/2/5/402582e1cf3523e44b73ea617ddf24b8.jpg",
        },
        {
            name: "Có Lẽ Anh Chưa Từng",
            singer: "OnlyC, Karik",
            path: "https://zingmp3.vn/bai-hat/Co-Le-Anh-Chua-Tung-OnlyC-Karik/ZOAC7EA9.html",
            image: "https://photo-resize-zmp3.zadn.vn/w240_r1x1_webp/cover/c/2/2/d/c22de29d498ba69b4624d1e20a778c05.jpg",
        },
        {
            name: "STAY",
            singer: "The Kid LAROI, Justin Bieber",
            path: "https://zingmp3.vn/bai-hat/STAY-The-Kid-LAROI-Justin-Bieber/ZUWIB0AW.html",
            image: "https://photo-resize-zmp3.zadn.vn/w240_r1x1_webp/cover/7/6/7/c/767ce49eda227dd737bc17589362f86a.jpg",
        },
        {
            name: "All Too Well",
            singer: " Taylor Swift",
            path: "https://www.nhaccuatui.com/bai-hat/all-too-well-taylor-swift.7utYkVdHk7Oj.html",
            image: "https://bloganchoi.com/wp-content/uploads/2021/11/taylor-swift-red-taylors-version.jpg",
        },

        {
            name: "All Too Well",
            singer: " Taylor Swift",
            path: "https://www.nhaccuatui.com/bai-hat/all-too-well-taylor-swift.7utYkVdHk7Oj.html",
            image: "https://bloganchoi.com/wp-content/uploads/2021/11/taylor-swift-red-taylors-version.jpg",
        },
        {
            name: "All Too Well",
            singer: " Taylor Swift",
            path: "https://www.nhaccuatui.com/bai-hat/all-too-well-taylor-swift.7utYkVdHk7Oj.html",
            image: "https://bloganchoi.com/wp-content/uploads/2021/11/taylor-swift-red-taylors-version.jpg",
        },
        {
            name: "All Too Well",
            singer: " Taylor Swift",
            path: "https://www.nhaccuatui.com/bai-hat/all-too-well-taylor-swift.7utYkVdHk7Oj.html",
            image: "https://bloganchoi.com/wp-content/uploads/2021/11/taylor-swift-red-taylors-version.jpg",
        },
        {
            name: "All Too Well",
            singer: " Taylor Swift",
            path: "https://www.nhaccuatui.com/bai-hat/all-too-well-taylor-swift.7utYkVdHk7Oj.html",
            image: "https://bloganchoi.com/wp-content/uploads/2021/11/taylor-swift-red-taylors-version.jpg",
        },
        {
            name: "All Too Well",
            singer: " Taylor Swift",
            path: "https://www.nhaccuatui.com/bai-hat/all-too-well-taylor-swift.7utYkVdHk7Oj.html",
            image: "https://bloganchoi.com/wp-content/uploads/2021/11/taylor-swift-red-taylors-version.jpg",
        },
        {
            name: "All Too Well",
            singer: " Taylor Swift",
            path: "https://www.nhaccuatui.com/bai-hat/all-too-well-taylor-swift.7utYkVdHk7Oj.html",
            image: "https://bloganchoi.com/wp-content/uploads/2021/11/taylor-swift-red-taylors-version.jpg",
        },
        {
            name: "All Too Well",
            singer: " Taylor Swift",
            path: "https://www.nhaccuatui.com/bai-hat/all-too-well-taylor-swift.7utYkVdHk7Oj.html",
            image: "https://bloganchoi.com/wp-content/uploads/2021/11/taylor-swift-red-taylors-version.jpg",
        },
        {
            name: "All Too Well",
            singer: " Taylor Swift",
            path: "https://www.nhaccuatui.com/bai-hat/all-too-well-taylor-swift.7utYkVdHk7Oj.html",
            image: "https://bloganchoi.com/wp-content/uploads/2021/11/taylor-swift-red-taylors-version.jpg",
        },
    ],

    handleEvents: function () {
        let withCD = cd.offsetWidth;
        // Even lăn chuột
        document.onscroll = () => {
            let newCD = withCD - window.scrollY;
            cd.style.width = newCD > 0 ? `${newCD}px` : `0px`;
            cd.style.opacity = newCD / withCD;
        };
    },

    render: function () {
        let innerPlaylist = this.songs.map((song) => {
            return `<div class="song">
                        <div class="thumb" style="background-image: url(${song.image})">
                    </div>
                    <div class="body">
                        <h3 class="title">${song.name}</h3>
                        <p class="author">${song.singer}</p>
                    </div>
                    <div class="option">
                        <i class="fas fa-ellipsis-h"></i>
                    </div>
                    </div>`;
        });

        playlist.innerHTML = innerPlaylist.join("");
    },

    defineProperties: function () {
        Object.defineProperty(this, "currentSong", {
            get: function () {
                return this.currentSong[this.currentIndex];
            },
        });
    },

    start: function () {
        this.defineProperties();
        this.handleEvents();
        this.render();
    },
};

app.start();
