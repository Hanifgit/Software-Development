const productComponent = {
    data() {
        return {
            currency: 'Taka'
        }
    },

    props: ['product'],
    template: '<div class="product">' +
        '<h3>{{  product.name }}  </h3>' +
        '<h3> {{ product.price }} {{ currency }}</h3>' +
        '</div>'

    // props: ['productName', 'price'],
    // template: '<div class="product">' +
    //     '<h3>{{  productName }} </h3>' +
    //     '<h3> {{ price }} </h3>' +
    //     '</div>'
}

Vue.component('product-component', productComponent);


const categoriComponent = {

    methods: {
        getcategories() {
            const categories = [{
                'name': 'category 1',
                'id': 1
            }, {
                'name': 'category 2',
                'id': 2
            }]
            return categories;
        }
    },
    // props: ['categori'],
    template: '<ul>' +
        '<li v-for="categori in getcategories()">{{ categori.name  }}</li>' +
        '</ul>'
}

Vue.component('categori-component', categoriComponent);