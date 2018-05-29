import React, { Component } from 'react';
import {Alert, Platform, StyleSheet, Text, View, Image, TouchableOpacity, TextInput, ImageBackground} from 'react-native';



export default class App extends Component {
  
  render(){
    return(
      <View style={styles.fundo}>
        <View>
        <TouchableOpacity style={styles.botao}><Image style = {styles.imagem3} source = {require("./imagens/martin.png")}/></TouchableOpacity>
        <Image style = {styles.imagem1} source = {require("./imagens/logo.png")}/>
        //<Image style = {styles.imagem3} source = {require("./imagens/martin.png")}/>
        <Text style={styles.texto2}>EA Vagas</Text>
        <Text style={styles.texto}>Você está em: Paris</Text>
        <Text style={styles.texto3}> Aqui você escolhe onde quer estacionar 
        o seu veículo lindo.</Text>
        
        
        <Image style = {styles.imagem2} source = {require("./imagens/paris.png")}/>
        
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
    marginBottom: 50
  },
  imagem1:{
    height: 50,
    resizeMode: 'contain',
    marginLeft: -80,
    marginTop: 40
  },
  texto2:{
    marginLeft: 70,
    marginTop: -40,
    fontSize: 15
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
    resizeMode: 'contain',
    height: 500,
    marginLeft: -25
  },
  imagem3:{
    resizeMode: 'contain',
    height: 50,
    alignSelf: 'center'
  }
});