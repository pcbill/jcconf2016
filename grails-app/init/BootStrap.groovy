import jcconf2016.Book

class BootStrap {

    def init = { servletContext ->

        new Book(title:"The Stand").save()

    }
    def destroy = {
    }
}
