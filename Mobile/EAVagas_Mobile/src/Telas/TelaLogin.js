import React, { Component } from 'react';
import {Alert, Platform, StyleSheet, Text, View, Image, TouchableOpacity, TextInput, ImageBackground, TouchableHighlight} from 'react-native';

import BotaoVoltar from './BotaoVoltar'
import TelaCadastro from './TelaCadastro'
import TelaHome from './TelaHome'


export default class App extends Component {
  
  render() {
    return (
      <View style={styles.fundo}>
      <Image style = {styles.imagem} source = {require("./imagens/logo.png")}/>
          <View>              
            <TextInput style = {styles.campotext} placeholder = "Digite o seu email" />
            <TextInput style = {styles.campotext1} placeholder = "Digite a sua senha" />
            <TouchableHighlight style = {styles.botao} 
            onPress = {()=>{this.props.navigator.push({id:'TelaHome'})}}>
              <Text style = {styles.textoBotao}> Login </Text>
            </TouchableHighlight>
            <TouchableHighlight style = {styles.botao1} 
            onPress = {()=>{this.props.navigator.push({id:'TelaCadastro'})}}>
              <Text style = {styles.textoBotao}> Cadastrar </Text>
            </TouchableHighlight>
            <TouchableHighlight
            onPress = {()=>{this.props.navigator.push({id:'TelaRedefinir'})}}>
              <Text style = {styles.textobotlink}> Esqueceu seu email ou senha? </Text>
            </TouchableHighlight>
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
    height:180,
    resizeMode: 'contain',
    alignSelf: "center"
  },
  campotext:{
    marginTop: 50,
    backgroundColor: '#F2F2F2',
    width: 310,
    alignSelf: 'center',
    padding: 10,
    borderRadius: 4
  },
  campotext1:{
    marginTop: 10,
    backgroundColor: '#F2F2F2',
    width: 310,
    alignSelf: 'center',
    padding: 10,
    borderRadius: 4
  },
  botao:{
    backgroundColor: '#DA0505',
    width: 130,
    alignSelf: 'center',
    padding: 12,
    marginTop: 50,
    borderRadius: 7,
    marginRight: 170
  },
  botao1:{
    backgroundColor: '#DA0505',
    width: 130,
    alignSelf: 'center',
    padding: 12,
    marginTop: -50,
    borderRadius: 7,
    marginLeft: 170
  },
  textoBotao:{
    color: '#FFFFFF',
    fontSize: 20,
    alignSelf: 'center'
  },
  textobotlink:{
    color: '#848484',
    marginTop: 25, 
    fontSize: 16, 
    alignSelf: 'center'
  }
});