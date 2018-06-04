import React, { Component } from 'react';
import {Alert, Platform, StyleSheet, Text, View, Image, TouchableOpacity, TextInput, ImageBackground} from 'react-native';



export default class App extends Component {
  
  render() {
    return (
      <View style={styles.fundo}>
          <View>  
          <TouchableOpacity style = {styles.botao1}>
              <Text style = {styles.textoBotao}> Voltar </Text>
            </TouchableOpacity>
          
          <Text style={styles.texto}>Perfil</Text>
          <Image style = {styles.imagem} source = {require("./imagens/perfil.png")}/>
          <Text style={styles.texto1}>Membro há 2 semanas</Text>
          <Text style={styles.texto2}>Nome: Jubileu Junior</Text>
          <Text style={styles.texto3}>Veículo: Carro FRD-3425</Text>
          <Text style={styles.texto3}>Estac. Preferido: Perdigão</Text>
            
            <TouchableOpacity style = {styles.botao}>
              <Text style = {styles.textoBotao}> Sair do App </Text>
            </TouchableOpacity>
            
      
          </View>
      </View>
    );
  }
}

const styles = StyleSheet.create({

  imagem:{
    resizeMode: 'contain',
    height: 80,
    marginLeft: -140
  },
  texto:{
    marginTop: 10,
    color: '#585858',
    fontSize: 30,
    textAlign: 'center',
    marginBottom: 20
  }, 
  texto1:{
    color: '#FF6347',
    fontSize: 15,
    marginBottom: 30,
    marginLeft: 160,
    marginTop: -20,
    fontStyle: 'italic'
  }, 
  texto2:{
    color: '#585858',
    fontSize: 15,
    marginTop: 35,
    marginBottom: 30,
    textAlign: 'center',
    fontWeight: 'bold'
  },
  texto3:{
    color: '#585858',
    fontSize: 15,
    marginBottom: 30,
    textAlign: 'center',
    fontWeight: 'bold'
  },
  fundo:{
    flex: 1, 
    backgroundColor: 'white'
  },
  botao:{
    backgroundColor: '#DA0505',
    width: 180,
    alignSelf: 'center',
    padding: 10,
    marginTop: 25,
    borderRadius: 7
  },
  textoBotao:{
    color: '#FFFFFF',
    fontSize: 13,
    alignSelf: 'center'
  },
  botao1:{
    backgroundColor: '#DA0505',
    width: 70,
    marginTop: 60,
    marginLeft: 15,
    padding: 10,
    borderRadius: 7
  }
});