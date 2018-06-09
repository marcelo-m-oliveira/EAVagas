import React, { Component } from 'react';
import {StyleSheet, Text, View, Image, TouchableOpacity, TouchableHighlight, TextInput, ImageBackground, Picker} from 'react-native';

export default class App extends Component {
  
  render() {
    return (
      <View style={styles.fundo}>
          <View>                  
          <Text style={styles.texto}>Dados do veículo</Text>
            <TextInput style = {styles.campotext} placeholder = "Placa do veículo"/>
            <Picker style = {styles.botao}>
            <Picker.Item label="Selecione o tipo do seu veículo" value = ""/>
            <Picker.Item label="Carro" value = "Carro"/>
            <Picker.Item label="Moto" value="Moto"/>
            </Picker>
            <TouchableHighlight style={styles.botao} onPress = {()=>{this.props.navigator.push({id:'DadosCartao'})}}>
            <Text style = {styles.textoBotao}> Próximo </Text>
          </TouchableHighlight>
          </View>
      </View>
    );
  }
}

const styles = StyleSheet.create({

  texto:{
    color: '#585858',
    fontSize: 25,
    alignSelf: 'center',
    marginTop: 150,
    marginBottom: 50,
    fontWeight: 'bold'
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
  botao:{
    backgroundColor: '#DA0505',
    width: 300,
    alignSelf: 'center',
    padding: 10,
    marginTop: 25,
    borderRadius: 7,
  },
  textoBotao:{
    color: '#FFFFFF',
    fontSize: 20,
    alignSelf: 'center',
  }
});