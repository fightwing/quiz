import React from 'react';
import {Table, Button, notification} from 'antd';

const URL = "http://localhost:8080/orders"

class Order extends React.Component{

    state ={
        data:[],
        orders:[]
    }

getOrders(){
    fetch(URL)
    .then(response => response.json())
    .then(result =>{
        this.setState({
            orders:result
        })
    })
}

    componentDidMount(){
        this.getOrders();
    }

    render(){
        const columns = [
            {
                title:'#',    
            },
            {
                title:'名称',
                dataIndex :'name',
                key:'name'
            },
            {
                title:'单价',
                dataIndex :'price',
                key:'price'
            },
            {
                title:'数量',
                dataIndex :'number',
                key:'number'
            }
        ]

        return(
            <div>
                <Table dataSource={this.state.data} columns={columns}></Table>
            </div>
        );
    }
}
export default Order;