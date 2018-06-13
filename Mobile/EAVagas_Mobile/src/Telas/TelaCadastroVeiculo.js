import React, { Component } from 'react';
import {StyleSheet, Text, View, TouchableHighlight, TextInput, ImageBackground, Picker} from 'react-native';

export default class PickerExample extends Component {
  state = {user: ''}
  updateUser = (user) => {
     this.setState({ user: user })
  }
  render() {
    return (
      <View style={styles.fundo}>
          <View>                  
          <TouchableHighlight style={styles.botao1} onPress = {()=>{this.props.navigator.push({id:'TelaCadastro'})}}>
              <Text style = {styles.textoBotao1}> Voltar </Text>
          </TouchableHighlight>
          <Text style={styles.texto}>Dados do veículo</Text>
            <TextInput style = {styles.campotext} placeholder = "Placa do veículo"/>
            <View>
            <Picker style = {styles.botao} selectedValue = {this.state.user} onValueChange = {this.updateUser}>
            <Picker.Item label= "Selecione o tipo do seu veículo"  value = ""/>
            <Picker.Item label= "Carro" value = "Carro"/>
            <Picker.Item label= "Moto" value = "Moto"/>
            </Picker>
            </View>
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
    color: '#000000',
    fontSize: 30,
    alignSelf: 'center',
    marginTop: 90,
    marginBottom: 90,
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
    color: '#fff',
    fontSize: 20,
    alignSelf: 'center',
  }
});