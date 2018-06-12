class Pessoa {

	contrutor (nome, sobrenome, email, cpf, tel, senha){
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.cpf = cpf;
		this.tel = tel;
		this.senha = senha;
	}

	get nome(){
		return this.nome;
	}
	get sobrenome(){
		return this.sobrenome;
	}
	get email(){
		return this.email;
	}
	get cpf(){
		return this.cpf;
	}
	get tel(){
		return this.tel;
    }
    set tel(){
        return this.tel;
    }
	get senha(){
		return this.senha;
	}
	set senha(){
		return this.senha;
	}
};