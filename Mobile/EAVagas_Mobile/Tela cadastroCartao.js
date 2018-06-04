import React, { Component } from 'react';
import {StyleSheet, Text, View, Image, TouchableOpacity, TextInput, ImageBackground, Picker} from 'react-native';



export default class App extends Component {
  
  render() {
    return (
      <View style={styles.fundo}>
          <View>                  
          <Text style={styles.texto1}>Insira o número do seu cartão de crédito</Text>
            <TextInput style = {styles.campotext} placeholder = "Número do cartão"/>
            <TextInput style = {styles.campotext1} placeholder = "Data de vencimento"/>
            <TextInput style = {styles.campotext1} placeholder = "Código de segurança"/>
            <TouchableOpacity style = {styles.botao}>
              <Text style = {styles.textoBotao}>Confirmar</Text>
            </TouchableOpacity>
          </View>
      </View>
    );
  }
}

const styles = StyleSheet.create({

  texto1:{
    marginTop: 40,
    color: '#585858',
    textAlign: 'center',
    fontSize: 30,
    margin: 15,
  }, 
  fundo:{
    flex: 1, 
    backgroundColor: 'white'
  },
  campotext:{
    marginTop: 100,
    backgroundColor: '#F2F2F2',
    width: 300,
    alignSelf: 'center',
    padding: 10,
    borderRadius: 4
  },
  campotext1:{
    marginTop: 10,
    backgroundColor: '#F2F2F2',
    width: 300,
    alignSelf: 'center',
    padding: 10,
    borderRadius: 4
  },
  botao:{
    backgroundColor: '#DA0505',
    width: 200,
    alignSelf: 'center',
    padding: 12,
    marginTop: 45,
    borderRadius: 7
  },
  textoBotao:{
    color: '#FFFFFF',
    fontSize: 20,
    alignSelf: 'center'
  }
});