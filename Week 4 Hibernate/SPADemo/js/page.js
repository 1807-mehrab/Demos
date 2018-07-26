class Page {
    constructor(url) {
        this.url = 'views/' + url;
    }

    load() {
        return $.get(this.url).done(res => this.html = res);
    }

    show(el) {
        el.innerHTML = this.html;
    }
}