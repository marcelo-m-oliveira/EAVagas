import React, { Component } from 'react';
import {
  Text,
  View,
}from 'react-native';
import TelaCadastro from './src/Telas/TelaCadastro'
import TelaCadastroCartao from './src/Telas/TelaCadastroCartao'
import TelaCadastroVeiculo from './src/Telas/TelaCadastroVeiculo'
import TelaFacaCartao from './src/Telas/TelaFacaCartao'
import TelaHome from './src/Telas/TelaHome'
import TelaLogin from './src/Telas/TelaLogin'
import TelaPerfil from './src/Telas/TelaPerfil'
import TelaPreferencias from './src/Telas/TelaPreferencias'
import TelaVagas from './src/Telas/TelaVagas'
import { Navigator } from 'react-native-deprecated-custom-components'

export default class App extends Component { 
  render() {
    return (
      <Navigator
        initialRoute = {
          {id: 'TelaLogin'}
        }
        renderScene = {(route, navigator) =>{
          if(route.id === 'TelaLogin'){
            return(
              <TelaLogin navigator = {navigator}/>
            );
          }
          else if(route.id === 'TelaHome'){
            return(
              <TelaHome navigator = {navigator}/>
            );
          }
          else if(route.id === 'TelaCadastro'){
            return(
              <TelaCadastro navigator = {navigator}/>
            );
          }
          else if(route.id === 'DadosVeiculo'){
            return(
              <TelaCadastroVeiculo navigator = {navigator}/>
            );
          }
          else if(route.id === 'DadosCartao'){
            return(
              <TelaFacaCartao navigator = {navigator}/>
            );
          }
          else if(route.id === 'CadastrarCartao'){
            return(
              <TelaCadastroCartao navigator = {navigator}/>
            );
          }
          if(route.id === 'TelaHome1'){
            return(
              <TelaHome navigator = {navigator}/>
            );
         }
         else if(route.id === 'Preferencias'){
          return(
            <TelaPreferencias navigator = {navigator}/>
          );
        }
        else if(route.id === 'TelaPerfil'){
          return(
            <TelaPerfil navigator = {navigator}/>
          );
        }
        else if (route.id === 'TelaVagas'){
          return(
            <TelaVagas navigator = {navigator}/>
          )
        }
        }}
      />
    );
  }
};