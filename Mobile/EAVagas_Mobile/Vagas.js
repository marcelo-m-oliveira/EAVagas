import React, { Component } from 'react';
import {Alert, Platform, StyleSheet, Text, View, Image, TouchableOpacity, TextInput, ImageBackground} from 'react-native';



export default class App extends Component {
  
  render() {
    return (
      <View style={styles.fundo}>
          <View>  
          <TouchableOpacity style = {styles.botao}>
              <Text style = {styles.textoBotao}> Voltar </Text>
            </TouchableOpacity>
          <Text style={styles.texto}>Estacionamento Perdigão</Text>
          <Text style={styles.texto1}>Escolha sua vaga</Text>
          <Text style={styles.texto2}>★ <Text style={styles.texto21}>Disponível</Text></Text>
          <Text style={styles.texto3}>★ <Text style={styles.texto21}>Reservado</Text></Text>
          <Text style={styles.texto4}>★ <Text style={styles.texto21}>Ocupado</Text></Text>
          
            
            <TouchableOpacity style = {styles.botao1}>
              <Text style = {styles.textoBotao}> A </Text>
            </TouchableOpacity>
            
            <TouchableOpacity style = {styles.botao2}>
              <Text style = {styles.textoBotao}> B </Text>
            </TouchableOpacity>
            
            <TouchableOpacity style = {styles.botao3}>
              <Text style = {styles.textoBotao}> C </Text>
            </TouchableOpacity>
            
            <TouchableOpacity style = {styles.botao4}>
              <Text style = {styles.textoBotao}> D </Text>
            </TouchableOpacity>
            
            <TouchableOpacity style = {styles.botao5}>
              <Text style = {styles.textoBotao}> E </Text>
            </TouchableOpacity>
            
            <TouchableOpacity style = {styles.botao6}>
              <Text style = {styles.textoBotao}> F </Text>
            </TouchableOpacity>
            
            <TouchableOpacity style = {styles.botao7}>
              <Text style = {styles.textoBotao}> G </Text>
            </TouchableOpacity>
            
            <TouchableOpacity style = {styles.botao8}>
              <Text style = {styles.textoBotao}> H </Text>
            </TouchableOpacity>
            
            <TouchableOpacity style = {styles.botao9}>
              <Text style = {styles.textoBotao}> Cancelar </Text>
            </TouchableOpacity>
      
          </View>
      </View>
    );
  }
}

const styles = StyleSheet.create({

  texto:{
    marginTop: 20,
    color: '#585858',
    fontSize: 27,
    textAlign: 'center',
    marginBottom: 5,
    fontWeight: 'bold'
  }, 
  texto1:{
    color: '#585858',
    fontSize: 25,
    marginBottom: 2,
    textAlign: 'center',
    fontWeight: 'bold'
  }, 
  texto2:{
    color: '#00FF7F',
    fontSize: 15,
    marginLeft: 20,
    marginTop: 25,
    marginBottom: 30,
  },
  texto3:{
    color: '#FFFF00',
    fontSize: 15,
    marginBottom: 30,
    marginTop: -51,
    alignSelf: 'center'
  },
  texto4:{
    color: '#B22222',
    fontSize: 15,
    marginTop: -51,
    marginBottom: 10,
    marginLeft: 260
  },
  fundo:{
    flex: 1, 
    backgroundColor: 'white'
  },
  botao:{
    backgroundColor: '#DA0505',
    width: 70,
    marginLeft: 15,
    padding: 10,
    marginTop: 50,
    borderRadius: 7
  },
  textoBotao:{
    color: '#FFFFFF',
    fontSize: 13,
    alignSelf: 'center'
  },
  botao1:{
    backgroundColor: '#00FF7F',
    width: 70,
    marginTop: 25,
    marginLeft: 50,
    padding: 10,
    borderRadius: 7
  },
  
  botao2:{
    backgroundColor: '#00FF7F',
    width: 70,
    marginTop: -37,
    marginLeft: 230,
    padding: 10,
    borderRadius: 7
  },
  
  botao3:{
    backgroundColor: '#FFD700',
    width: 70,
    marginTop: 20,
    marginLeft: 50,
    padding: 10,
    borderRadius: 7
  },
  
  botao4:{
    backgroundColor: '#B22222',
    width: 70,
    marginTop: -37,
    marginLeft: 230,
    padding: 10,
    borderRadius: 7
  },
  
  botao5:{
    backgroundColor: '#B22222',
    width: 70,
    marginTop: 20,
    marginLeft: 50,
    padding: 10,
    borderRadius: 7
  },
  
  botao6:{
    backgroundColor: '#00FF7F',
    width: 70,
    marginTop: -36,
    marginLeft: 230,
    padding: 10,
    borderRadius: 7
  },
  
  botao7:{
    backgroundColor: '#00FF7F',
    width: 70,
    marginTop: 20,
    marginLeft: 50,
    padding: 10,
    borderRadius: 7
  },
 
  botao8:{
    backgroundColor: '#FFD700',
    width: 70,
    marginTop: -37,
    marginLeft: 230,
    marginBottom: -20,
    padding: 10,
    borderRadius: 7
  },
  
  botao9:{
    backgroundColor: '#DA0505',
    width: 200,
    alignSelf: 'center',
    padding: 10,
    marginTop: 70,
    borderRadius: 7
  },
  
  texto21:{
    color: '#585858'
  }
});