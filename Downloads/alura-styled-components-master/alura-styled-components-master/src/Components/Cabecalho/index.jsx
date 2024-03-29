import React from "react";
import styled from "styled-components";
import bank_logo from "../../assets/images/bank_logo.svg";
import {corPrimaria} from '../UI/variaveis';

const styledHeader = styled.nav`
background-color: #41d3be;
display: flex;
justify-content: space-between;
padding: 0 15vw;
height: 10vh;
align-items: center;`; 


const Cabecalho = () => {
  return (
    <div className="cabecalho">
      <img className="imagem-logo" src={bank_logo} alt="Logo Smart Bank" />
      <div>
        <a className="btn-secundario" href="https://google.com">
          Ajuda
        </a>
        <a className="btn-primario" href="https://google.com">
          Sair
        </a>
      </div>
    </div>
  );
};

export default Cabecalho;
