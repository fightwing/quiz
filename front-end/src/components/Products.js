import React from 'react';
import Product from './Product';


const URL = "http://localhost:8080/products"
class Products extends React.Component{
    constructor(props){
        super(props);
        this.state={
            Products:[],
        }
    }

    componentDidMount() {
        async function fetchData(url) {
          const result = await fetch(url).then((response) => response.json());
          return result;
        }
        fetchData(URL)
          .then((result) => {
            this.setState({
              Products: result,
            });
            console.log(this.state.Products)
          })
          .catch((error) => {
            console.log(error);
          });
      }

      render() {
          return (
              <div>
                  {this.state.Products.map((product)=>(
                      <Product
                          id={product.id}
                          key={product.id}
                          price={product.price}
                          name={product.name}
                          unit={product.unit}
                          url={product.url}
                        />
                  ))}
              </div>
          );
      }


    }

      

export default Products;