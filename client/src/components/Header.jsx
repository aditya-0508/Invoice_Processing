
import {AppBar,Toolbar} from '@mui/material';{/*Adding the Appbar and toolbar*/}


const Header=()=>{
    const logo="https://dashboard.getinvoice.co/dboard/img/logo.png";
    return(
        <AppBar color='secondary' position='static'>
            <Toolbar>
                <img src={logo} alt="logo" style={{width:120}}/>
            </Toolbar>
        </AppBar>
    )
}

export default Header;