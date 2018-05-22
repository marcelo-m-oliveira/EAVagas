import React, { Component } from 'react';
import {Alert, Platform, StyleSheet, Text, View, Image, TouchableOpacity, TextInput, ImageBackground} from 'react-native';



export default class App extends Component {
  
  render() {
    return (
      <View style={styles.fundo}>
          <View>          
            <Image style = {styles.imagem} source = {require("./imagens/logo.png")}/>    
            <TextInput style = {styles.campotext} placeholder = "Digite o seu email" />
            <TextInput style = {styles.campotext1} placeholder = "Digite a sua senha" />
            <TouchableOpacity style = {styles.botao}>
              <Text style = {styles.textoBotao}> Entrar </Text>
            </TouchableOpacity>
            <TouchableOpacity style = {styles.botao1}>
              <Text style = {styles.textoBotao}> Cadastrar </Text>
            </TouchableOpacity>
            <TouchableOpacity>
              <Text style = {styles.textobotlink}> Esqueceu a senha? </Text>
            </TouchableOpacity>

          </View>
      </View>
    );
  }
}

const styles = StyleSheet.create({

  fundo:{
    flex: 1, 
    backgroundColor: 'white'
  },
  imagem:{
    marginTop: 100,
    height:150,
    resizeMode: 'contain',
    alignSelf: "center"
  },
  campotext:{
    marginTop: 50,
    backgroundColor: '#F2F2F2',
    width: 300,
    alignSelf: 'center',
    padding: 10,
    borderRadius: 10
  },
  campotext1:{
    marginTop: 10,
    backgroundColor: '#F2F2F2',
    width: 300,
    alignSelf: 'center',
    padding: 10,
    borderRadius: 10
  },
  botao:{
    backgroundColor: '#DA0505',
    width: 120,
    alignSelf: 'center',
    padding: 10,
    marginTop: 50,
    borderRadius: 10,
    marginRight: 200
  },
  botao1:{
    backgroundColor: '#DA0505',
    width: 120,
    alignSelf: 'center',
    padding: 10,
    marginTop: -45,
    borderRadius: 10,
    marginLeft: 200
  },
  textoBotao:{
    color: '#FFFFFF',
    fontSize: 20,
    alignSelf: 'center'
  },
  textobotlink:{
    color: '#848484',
    marginTop: 50, 
    fontSize: 20, 
    alignSelf: 'center'
  }
});