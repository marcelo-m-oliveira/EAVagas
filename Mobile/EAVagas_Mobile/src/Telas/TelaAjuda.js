import React, { Component } from 'react';
import {Alert, Platform, StyleSheet, Text, View, Image, TouchableHighlight, TextInput, ImageBackground, Switch} from 'react-native';



export default class App extends Component {
  
  render(){
    return(
      <View style={styles.fundo}>
        <View>
        <TouchableHighlight style={styles.botao1} onPress = {()=>{this.props.navigator.push({id:'Preferencias'})}}>
        <Text style={styles.textoBotao1}> Voltar </Text>
          </TouchableHighlight>
        
        <Text style={styles.texto}>Ajuda</Text>
        
      
        <Text style={styles.texto2}>Precisa de algo? Fale com nossos desenvolvedores:</Text>
        <Text style={styles.texto2}>Lucas: (75) 98301-4336</Text>
        <Text style={styles.texto2}>Marcelo: (75) 99177-8281</Text>
        <Text style={styles.texto2}>facebook.com/EAVagas</Text>
        
        
        </View>
      </View>
      
      )
  }
}

const styles = StyleSheet.create({
  
  fundo:{
    alignItems: 'center'
  },
  texto:{
    marginTop: 20,
    color: '#585858',
    fontSize: 30,
    alignSelf: 'center',
    marginBottom: 50,
    fontWeight: 'bold'
  },
  texto2:{
    alignSelf: 'center',
    fontSize:15,
    marginBottom: 30,
  },
  botao1:{
    backgroundColor: '#DA0505',
    width: 70,
    marginLeft: -15,
    marginTop: 15,
    padding: 10,
    borderRadius: 7
  },
  textoBotao1:{
    color: '#FFFFFF',
    fontSize: 13,
    alignSelf: 'center'
  } 
});