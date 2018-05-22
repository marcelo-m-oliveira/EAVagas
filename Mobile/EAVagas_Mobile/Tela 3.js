import React, { Component } from 'react';
import {StyleSheet, Text, View, Image, TouchableOpacity, TextInput, ImageBackground, Picker} from 'react-native';



export default class App extends Component {
  
  render() {
    return (
      <View style={styles.fundo}>
          <View>                  
          <Text style={styles.texto1}>Dados do veículo</Text>
            <TextInput style = {styles.campotext} placeholder = "Placa do veículo"/>
            <Picker style = {styles.botao}>
            <Picker.Item label="Selecione o tipo do seu veículo" value = ""/>
            <Picker.Item label="Carro" value = "Carro"/>
            <Picker.Item label="Moto" value="Moto"/>
            </Picker>
            <TouchableOpacity style = {styles.botao}>
              <Text style = {styles.textoBotao}> Próximo </Text>
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
    borderRadius: 7
  },
  textoBotao:{
    color: '#FFFFFF',
    fontSize: 20,
    alignSelf: 'center'
  }
});