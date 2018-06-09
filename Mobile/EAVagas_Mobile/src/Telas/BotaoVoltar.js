import React, { Component } from 'react';
import {
  Text, View, StyleSheet, TouchableHighlight, Image
} from 'react-native';
export default class BotaoVoltar extends Component {
  render() {

        if(this.props.voltar){
            return(
                <View style = {styles.container}>
                    <TouchableHighlight onPress={()=>{this.props.navigator.pop();}}>
                        <Image source = {botao}/> 
                    </TouchableHighlight>             
                    
                </View>
            );
        }
  }
}

const styles = StyleSheet.create({
    texto : {
        fontSize: 20,
        alignSelf: 'center'
    },
    container : {
        backgroundColor: 'grey',
        padding: 10,        
        height: 60,
        flexDirection: 'row'
    }
});