import React, { Component } from 'react';
import {StyleSheet, Text, View, Image, TouchableOpacity, TouchableHighlight, TextInput, ImageBackground, Picker} from 'react-native';

export default class App extends Component {
  
  render() {
    return (
      <View style={styles.fundo}>
          <View>                  
          <TouchableHighlight style={styles.botao1} onPress = {()=>{this.props.navigator.push({id:'TelaLogin'})}}>
              <Text style = {styles.textoBotao1}> Voltar </Text>
          </TouchableHighlight>
          <Text style={styles.texto}>Redefinição de senha</Text>
            <TextInput style = {styles.campotext} placeholder = "Email que deseja recuperar"/>
            <TouchableHighlight style={styles.botao} onPress = {()=>{this.props.navigator.push({id:'TelaLogin'})}}>
            <Text style = {styles.textoBotao}> Enviar </Text>
          </TouchableHighlight>
          </View>
      </View>
    );
  }
}

const styles = StyleSheet.create({

  texto:{
    color: '#000000',
    fontSize: 30,
    alignSelf: 'center',
    marginTop: 100,
    marginBottom: 50,
    fontWeight: 'bold'
  }, 
  botao1:{
    backgroundColor: '#DA0505',
    width: 70,
    marginTop: 10,
    marginLeft: 15,
    padding: 10,
    borderRadius: 7
  },
  textoBotao1:{
    color: '#FFFFFF',
    fontSize: 13,
    alignSelf: 'center'
  },
  fundo:{
    flex: 1, 
    backgroundColor: 'white'
  },
  campotext:{
    marginTop: 30,
    backgroundColor: '#F2F2F2',
    width: 300,
    alignSelf: 'center',
    padding: 10,
    borderRadius: 4
  },
  botao:{
    backgroundColor: '#DA0505',
    width: 300,
    alignSelf: 'center',
    padding: 10,
    marginTop: 40,
    borderRadius: 7,
  },
  textoBotao:{
    color: '#FFFFFF',
    fontSize: 20,
    alignSelf: 'center',
  }
});