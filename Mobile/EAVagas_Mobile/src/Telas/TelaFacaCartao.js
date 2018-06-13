import React, { Component } from 'react';
import {Alert, Platform, StyleSheet, Text, View, Image, TouchableHighlight, TextInput, ImageBackground} from 'react-native';



export default class App extends Component {
  
  render() {
    return (
      <View style={styles.fundo}>
          <View>        
          <TouchableHighlight style={styles.botao1} onPress = {()=>{this.props.navigator.push({id:'DadosVeiculo'})}}>
              <Text style = {styles.textoBotao1}> Voltar </Text>
          </TouchableHighlight>   
          <Text style={styles.texto}>Cadastre seu Cartão de Crédito!</Text>
          <Text style={styles.texto1}>Reservar sua vaga fica ainda mais fácil com um pagamento antecipado! Fique tranquilo, não abriremos mão da sua vaga até que cancele o pagamento.</Text>
            
          <TouchableHighlight style={styles.botao} onPress = {()=>{this.props.navigator.push({id:'CadastrarCartao'})}}>
          <Text style = {styles.textoBotao}> Eu topo </Text>
          </TouchableHighlight>
            
          <TouchableHighlight style={styles.botao2} onPress = {()=>{this.props.navigator.push({id:'TelaHome'})}}>
          <Text style = {styles.textoBotao2}> Vou pensar </Text>
          </TouchableHighlight>
          </View>
      </View>
    );
  }
}

const styles = StyleSheet.create({

  texto:{
    marginTop: 100,
    color: '#000000',
    fontSize: 30,
    textAlign: 'center',
    marginBottom: 20,
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
    padding: 12,
    marginTop: 25,
    borderRadius: 7
  },
  botao2:{
    backgroundColor: '#A9A9A9',
    width: 120,
    marginLeft: 230,
    padding: 12,
    marginTop: -42,
    borderRadius: 7
  },
  textoBotao:{
    color: '#FFFFFF',
    fontSize: 13,
    alignSelf: 'center',
    fontWeight: 'bold'
  },
  textoBotao2:{
    color: '#000000',
    fontSize: 13,
    alignSelf: 'center',
    fontWeight: 'bold'
  }
});