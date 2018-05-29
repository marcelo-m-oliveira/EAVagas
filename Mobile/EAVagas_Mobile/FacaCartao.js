import React, { Component } from 'react';
import {Alert, Platform, StyleSheet, Text, View, Image, TouchableOpacity, TextInput, ImageBackground} from 'react-native';



export default class App extends Component {
  
  render() {
    return (
      <View style={styles.fundo}>
          <View>           
          <Text style={styles.texto}>Cadastre seu Cartão de Crédito!</Text>
          <Text style={styles.texto1}>Reservar sua vaga fica ainda mais fácil com um pagamento antecipado! Fique tranquilo, não abriremos mão da sua vaga até que cancele o pagamento.</Text>
            
            <TouchableOpacity style = {styles.botao}>
              <Text style = {styles.textoBotao}> EU TOPO </Text>
            </TouchableOpacity>
            
            <TouchableOpacity style = {styles.botao2}>
              <Text style = {styles.textoBotao2}> VOU PENSAR </Text>
            </TouchableOpacity>
          </View>
      </View>
    );
  }
}

const styles = StyleSheet.create({

  texto:{
    marginTop: 100,
    color: '#585858',
    fontSize: 30,
    textAlign: 'center',
    marginBottom: 20,
  }, 
  texto1:{
    color: '#585858',
    fontSize: 15,
    marginBottom: 30,
    textAlign: 'center'
  }, 
  fundo:{
    flex: 1, 
    backgroundColor: 'white'
  },
  botao:{
    backgroundColor: '#DA0505',
    width: 120,
    marginLeft: 40,
    padding: 10,
    marginTop: 25,
    borderRadius: 7
  },
  botao2:{
    backgroundColor: '#A9A9A9',
    width: 120,
    marginLeft: 200,
    padding: 10,
    marginTop: -38,
    borderRadius: 7
  },
  textoBotao:{
    color: '#FFFFFF',
    fontSize: 13,
    alignSelf: 'center'
  },
  textoBotao2:{
    color: '#FFFFFF',
    fontSize: 13,
    alignSelf: 'center'
  }
})