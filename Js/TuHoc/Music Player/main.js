const $ = document.querySelector.bind(document);
const $$ = document.querySelectorAll.bind(document);

const player = $(".player");
const cd = $(".cd");
const heading = $("header h2");
const cdThumb = $(".cd-thumb");
const audio = $("#audio");
const playBtn = $(".btn-toggle-play");
const progress = $("#progress");
const prevBtn = $(".btn-prev");
const nextBtn = $(".btn-next");
const randomBtn = $(".btn-random");
const repeatBtn = $(".btn-repeat");
const playlist = $(".playlist");

const app = {
    currentIndex: 0,
    isPlaying: false,
    isRandom: false,
    isRepeat: false,
    config: {},

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

    setConfig: function (key, value) {
        this.config[key] = value;
        // (2/2) Uncomment the line below to use localStorage
        // localStorage.setItem(PlAYER_STORAGE_KEY, JSON.stringify(this.config));
    },
    render: function () {
        const htmls = this.songs.map((song, index) => {
            return `
                        <div class="song ${
                            index === this.currentIndex ? "active" : ""
                        }" data-index="${index}">
                            <div class="thumb"
                                style="background-image: url('${song.image}')">
                            </div>
                            <div class="body">
                                <h3 class="title">${song.name}</h3>
                                <p class="author">${song.singer}</p>
                            </div>
                            <div class="option">
                                <i class="fas fa-ellipsis-h"></i>
                            </div>
                        </div>
                    `;
        });
        playlist.innerHTML = htmls.join("");
    },
    defineProperties: function () {
        Object.defineProperty(this, "currentSong", {
            get: function () {
                return this.songs[this.currentIndex];
            },
        });
    },
    handleEvents: function () {
        const _this = this;
        const cdWidth = cd.offsetWidth;

        // Xử lý CD quay / dừng
        // Handle CD spins / stops
        const cdThumbAnimate = cdThumb.animate(
            [{ transform: "rotate(360deg)" }],
            {
                duration: 10000, // 10 seconds
                iterations: Infinity,
            }
        );
        cdThumbAnimate.pause();

        // Xử lý phóng to / thu nhỏ CD
        // Handles CD enlargement / reduction
        document.onscroll = function () {
            const scrollTop =
                window.scrollY || document.documentElement.scrollTop;
            const newCdWidth = cdWidth - scrollTop;

            cd.style.width = newCdWidth > 0 ? newCdWidth + "px" : 0;
            cd.style.opacity = newCdWidth / cdWidth;
        };

        // Xử lý khi click play
        // Handle when click play
        playBtn.onclick = function () {
            if (_this.isPlaying) {
                audio.pause();
            } else {
                audio.play();
            }
        };

        // Khi song được play
        // When the song is played
        audio.onplay = function () {
            _this.isPlaying = true;
            player.classList.add("playing");
            cdThumbAnimate.play();
        };

        // Khi song bị pause
        // When the song is pause
        audio.onpause = function () {
            _this.isPlaying = false;
            player.classList.remove("playing");
            cdThumbAnimate.pause();
        };

        // Khi tiến độ bài hát thay đổi
        // When the song progress changes
        audio.ontimeupdate = function () {
            if (audio.duration) {
                const progressPercent = Math.floor(
                    (audio.currentTime / audio.duration) * 100
                );
                progress.value = progressPercent;
            }
        };

        // Xử lý khi tua song
        // Handling when seek
        progress.onchange = function (e) {
            const seekTime = (audio.duration / 100) * e.target.value;
            audio.currentTime = seekTime;
        };

        // Khi next song
        // When next song
        nextBtn.onclick = function () {
            if (_this.isRandom) {
                _this.playRandomSong();
            } else {
                _this.nextSong();
            }
            audio.play();
            _this.render();
            _this.scrollToActiveSong();
        };

        // Khi prev song
        // When prev song
        prevBtn.onclick = function () {
            if (_this.isRandom) {
                _this.playRandomSong();
            } else {
                _this.prevSong();
            }
            audio.play();
            _this.render();
            _this.scrollToActiveSong();
        };

        // Xử lý bật / tắt random song
        // Handling on / off random song
        randomBtn.onclick = function (e) {
            _this.isRandom = !_this.isRandom;
            _this.setConfig("isRandom", _this.isRandom);
            randomBtn.classList.toggle("active", _this.isRandom);
        };

        // Xử lý lặp lại một song
        // Single-parallel repeat processing
        repeatBtn.onclick = function (e) {
            _this.isRepeat = !_this.isRepeat;
            _this.setConfig("isRepeat", _this.isRepeat);
            repeatBtn.classList.toggle("active", _this.isRepeat);
        };

        // Xử lý next song khi audio ended
        // Handle next song when audio ended
        audio.onended = function () {
            if (_this.isRepeat) {
                audio.play();
            } else {
                nextBtn.click();
            }
        };

        // Lắng nghe hành vi click vào playlist
        // Listen to playlist clicks
        playlist.onclick = function (e) {
            const songNode = e.target.closest(".song:not(.active)");

            if (songNode || e.target.closest(".option")) {
                // Xử lý khi click vào song
                // Handle when clicking on the song
                if (songNode) {
                    _this.currentIndex = Number(songNode.dataset.index);
                    _this.loadCurrentSong();
                    _this.render();
                    audio.play();
                }

                // Xử lý khi click vào song option
                // Handle when clicking on the song option
                if (e.target.closest(".option")) {
                }
            }
        };
    },
    scrollToActiveSong: function () {
        setTimeout(() => {
            $(".song.active").scrollIntoView({
                behavior: "smooth",
                block: "nearest",
            });
        }, 300);
    },
    loadCurrentSong: function () {
        heading.textContent = this.currentSong.name;
        cdThumb.style.backgroundImage = `url('${this.currentSong.image}')`;
        audio.src = this.currentSong.path;
    },
    loadConfig: function () {
        this.isRandom = this.config.isRandom;
        this.isRepeat = this.config.isRepeat;
    },
    nextSong: function () {
        this.currentIndex++;
        if (this.currentIndex >= this.songs.length) {
            this.currentIndex = 0;
        }
        this.loadCurrentSong();
    },
    prevSong: function () {
        this.currentIndex--;
        if (this.currentIndex < 0) {
            this.currentIndex = this.songs.length - 1;
        }
        this.loadCurrentSong();
    },
    playRandomSong: function () {
        let newIndex;
        do {
            newIndex = Math.floor(Math.random() * this.songs.length);
        } while (newIndex === this.currentIndex);

        this.currentIndex = newIndex;
        this.loadCurrentSong();
    },
    start: function () {
        // Gán cấu hình từ config vào ứng dụng
        // Assign configuration from config to application
        this.loadConfig();

        // Định nghĩa các thuộc tính cho object
        // Defines properties for the object
        this.defineProperties();

        // Lắng nghe / xử lý các sự kiện (DOM events)
        // Listening / handling events (DOM events)
        this.handleEvents();

        // Tải thông tin bài hát đầu tiên vào UI khi chạy ứng dụng
        // Load the first song information into the UI when running the app
        this.loadCurrentSong();

        // Render playlist
        this.render();

        // Hiển thị trạng thái ban đầu của button repeat & random
        // Display the initial state of the repeat & random button
        randomBtn.classList.toggle("active", this.isRandom);
        repeatBtn.classList.toggle("active", this.isRepeat);
    },
};

app.start();
