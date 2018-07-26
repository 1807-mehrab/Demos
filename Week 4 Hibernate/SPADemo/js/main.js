const r = new Router (
    {
        '#default': new Page('menu.html'),
        home: new Layout(new Page('menu.html'), new Page('home.html')),
        about: new Layout(new Page('menu.html'), new Page('about.html'))
    },
    document.querySelector('main')
)