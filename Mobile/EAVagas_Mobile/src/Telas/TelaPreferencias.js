import React, { Component } from 'react';
import {Alert, Platform, StyleSheet, Text, View, Image, TouchableOpacity, TextInput, ImageBackground} from 'react-native';



export default class App extends Component {
  
  render(){
    return(
      <View style={styles.fundo}>
        <View>
        <TouchableOpacity style={styles.botao1}>
          <Text style={styles.textoBotao1}> Voltar </Text>
        </TouchableOpacity>
        
        <Text style={styles.texto}>Preferências</Text>
        
        <TouchableOpacity style={styles.botao2}>
          <Text style={styles.textoBotao2}> Conta </Text>
        </TouchableOpacity>
        
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
  botao2:{
    marginLeft: 20,
    padding: 10
  },
  textoBotao2:{
    fontSize: 25
  }  
});