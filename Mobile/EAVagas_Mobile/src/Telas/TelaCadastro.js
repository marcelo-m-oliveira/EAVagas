import React, { Component } from 'react';
import {Alert, Platform, StyleSheet, Text, View, Image, TouchableOpacity, TouchableHighlight, TextInput, ImageBackground} from 'react-native';



export default class App extends Component {
  
  render() {
    return (
      <View style={styles.fundo}>
          <View>
          <TouchableHighlight style={styles.botao1} onPress = {()=>{this.props.navigator.push({id:'TelaLogin'})}}>
              <Text style = {styles.textoBotao1}> Voltar </Text>
          </TouchableHighlight>
          <Text style={styles.texto}>Crie a sua conta</Text>
          <Text style={styles.texto1}>Dados pessoais</Text>
            <TextInput style = {styles.campotext} placeholder = "Nome"/>
            <TextInput style = {styles.campotext1} placeholder = "Sobrenome"/>
            <TextInput style = {styles.campotext1} placeholder = "CPF"/>
            <TextInput style = {styles.campotext1} placeholder = "Tel"/>
            <TextInput style = {styles.campotext1} placeholder = "Email"/>
            <TextInput password={true} style={styles.campotext1} placeholder = "Senha"/>
            <TextInput password={true} style={styles.campotext1} placeholder = "Confirme a senha"/>
            <TouchableHighlight style={styles.botao} onPress = {()=>{this.props.navigator.push({id:'DadosVeiculo'})}}>
            <Text style = {styles.textoBotao}> Próximo </Text>
          </TouchableHighlight>
              
          </View>
      </View>
    );
  }
}

const styles = StyleSheet.create({

  botao1:{
    backgroundColor: '#DA0505',
    width: 70,
    marginTop: 10,
    marginLeft: 15,
    padding: 10,
    borderRadius: 7
  },
  texto:{
    marginTop: 20,
    color: '#585858',
    fontSize: 24,
    alignSelf: 'center',
    margin: 15,
  }, 
  texto1:{
    color: '#585858',
    fontSize: 18,
    margin: 15,
  }, 
  fundo:{
    flex: 1, 
    backgroundColor: 'white'
  },
  campotext:{
    marginTop: 18,
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
    width: 300,
    alignSelf: 'center',
    padding: 10,
    marginTop: 25,
    borderRadius: 10
  },
  textoBotao1:{
    color: '#FFFFFF',
    fontSize: 13,
    alignSelf: 'center'
  },
  textoBotao:{
    color: '#FFFFFF',
    fontSize: 20,
    alignSelf: 'center'
  }
});