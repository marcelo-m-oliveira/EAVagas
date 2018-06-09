import React, { Component } from 'react';
import {Alert, Platform, StyleSheet, Text, View, Image, TouchableOpacity, TouchableHighlight, TextInput, ImageBackground} from 'react-native';



export default class App extends Component {
  
  render(){
    return(
      <View style={styles.fundo}>
        <View>
        <TouchableHighlight style={styles.botao1} onPress = {()=>{this.props.navigator.push({id:'TelaHome1'})}}>
        <Text style={styles.textoBotao1}> Voltar </Text>
          </TouchableHighlight>
        
        <Text style={styles.texto}>Preferências</Text>
        
        <TouchableHighlight style={styles.botao2} onPress = {()=>{this.props.navigator.push({id:'TelaPerfil'})}}>
        <Text style={styles.textoBotao2}> Perfil </Text>
          </TouchableHighlight>
        
        <TouchableOpacity style={styles.botao2}>
          <Text style={styles.textoBotao2}> Notificações </Text>
        </TouchableOpacity>
        
        <TouchableOpacity style={styles.botao2}>
          <Text style={styles.textoBotao2}> Ajuda </Text>
        </TouchableOpacity>
        
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
  botao1:{
    marginTop: 15,
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
  botao2:{
    marginLeft: 20,
    padding: 10
  },
  textoBotao2:{
    fontSize: 25
  }  
});