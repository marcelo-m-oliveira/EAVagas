import React, { Component } from 'react';
import {Alert, Platform, StyleSheet, Text, View, Image, TouchableOpacity, TouchableHighlight, TextInput, ImageBackground} from 'react-native';

export default class App extends Component {
  
  render(){
    return(
      <View style={styles.fundo}>
        <View>
        <Image style = {styles.imagem} source = {require("./imagens/logo.png")}/>
        <Text style={styles.texto2}>EA Vagas</Text>
        <TouchableHighlight style={styles.botao} onPress = {()=>{this.props.navigator.push({id:'CadastrarCartao'})}}>
            <Text style = {styles.textoBotao}> Seja Premium </Text>
          </TouchableHighlight>
          <TouchableHighlight style = {styles.imagem1} onPress = {()=>{this.props.navigator.push({id:'Preferencias'})}}>
          <Image source = {require("./imagens/BarraMenu.png")}/>
          </TouchableHighlight>
        <Text style={styles.texto}>Você está em: Paris</Text>
        <Text style={styles.texto3}> Aqui você escolhe onde quer estacionar 
        o seu veículo lindo.</Text>
        <TouchableHighlight style = {styles.imagem2} onPress = {()=>{this.props.navigator.push({id:'TelaVagas'})}}>
            <Image source = {require("./imagens/paris.png")}/>
        </TouchableHighlight>
        </View>
      </View>
      
      )
  }
}

const styles = StyleSheet.create({
  
  texto:{
    marginTop: 35,
    color: '#000000',
    fontSize: 25,
    alignSelf: 'center',
    marginBottom: 50,
    fontWeight: 'bold'
  },
  imagem1 : {
    marginTop: -35,
    marginLeft: 370,
    flexDirection: 'row',
    justifyContent: 'space-between'
},
  botao:{
    backgroundColor: '#DA0505',
    width: 110,
    alignSelf: 'center',
    padding: 10,
    marginLeft: 100,
    marginTop: -30,
    borderRadius: 7,
  },
  textoBotao:{
    color: '#FFFFFF',
    fontSize: 13,
    alignSelf: 'center',
  },
  imagem:{
    height: 50,
    resizeMode: 'contain',
    marginLeft: -80,
    marginTop: 10
  },
  texto2:{
    color: '#000000',
    marginLeft: 70,
    marginTop: -40,
    fontSize: 18
  },
  texto3:{
    color: '#585858',
    alignSelf: 'center',
    textAlign: 'center',
    fontSize: 15,
    marginTop: -30,
    marginBottom: 30
  },
  imagem2:{
    //resizeMode: 'contain',
    height: 610,
    marginLeft: 4
    //alignSelf: 'center'
  }
});