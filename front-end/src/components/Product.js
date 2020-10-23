import React from 'react'
import {Image,Button} from 'semantic-ui-react'
import '../Style/product.css'

class Product extends React.Component{
    constructor(props){
        super(props);
        this.state={
            id:this.props.id,
            name:this.props.name,
            price:this.props.price,
            unit:this.props.unit,
            url:this.props.url,
        }  
    }

    

    render(){
        return (
            <div className= "product">
                <Image src={this.state.url} size='small' style={{width:80,height:120}}></Image>
                <div>{this.state.name}</div>
                <div>单价: {this.state.price}元/{this.state.unit}</div>
                <Button> 下订单 </Button>
        </div>
        );
    }
}
export default Product;