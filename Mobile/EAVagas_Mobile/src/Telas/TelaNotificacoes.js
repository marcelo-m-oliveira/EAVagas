import React, { Component } from 'react';
import {Alert, Platform, StyleSheet, Text, View, Image, TouchableOpacity, TextInput, ImageBackground, TouchableHighlight, Switch} from 'react-native';



export default class App extends Component {
  
  render(){
    return(
      <View style={styles.fundo}>
        <View>
        <TouchableHighlight style={styles.botao1} onPress = {()=>{this.props.navigator.push({id:'TelaHome1'})}}>
        <Text style={styles.textoBotao1}> Voltar </Text>
          </TouchableHighlight>
        
        <Text style={styles.texto}>Notificações</Text>
        
         <Switch
            onValueChange = {props.toggleSwitch1}
            value = {props.switch1Value}/>
         <Switch
            onValueChange = {props.toggleSwitch2}
            value = {props.switch2Value}/>
        
        <Text style={styles.texto2}>Receber notificações por push</Text>
        <Text style={styles.texto2}>Ícone no App</Text>
        <Text style={styles.texto2}>Sons</Text>
        <Text style={styles.texto2}>Desativar notificações</Text>
        
        
        </View>
      </View>
      
      )
  }
}

const styles = StyleSheet.create({
  
  texto:{
    marginTop: 20,
    color: '#585858',
    fontSize: 30,
    alignSelf: 'center',
    marginBottom: 50,
    fontWeight: 'bold'
  },
  texto2:{
    marginLeft: 10,
    fontSize: 15,
    marginBottom: 30
  },
  botao1:{
    marginTop: 60,
    backgroundColor: "#DA0505",
    width: 70,
    marginLeft: 15,
    padding: 10,
    borderRadius: 7
  },
  textoBotao1:{
    color: '#FFFFFF',
    fontSize: 13,
    alignSelf: 'center'
  },

 
  
  
});