import React , { Component } from 'react';
import {
  BrowserRouter, Switch,
  Route, Redirect,
} from 'react-router-dom';
import PrivateRoute from './PrivateRoute';
import Login from "./containers/login/Login";
import SignIn from "./containers/login2/SignIn";
import NotFound from "./containers/notFound/NotFound";
import Main from "./containers/main/Main";

const App = () => {
  return (
      <BrowserRouter>
          <Switch>
              <PrivateRoute exact path="/" component={Main} />
              <Route exact path="/login" component={Login} />
              <Route exact path="/sign-in" component={SignIn} />
              <Route component={NotFound} />
          </Switch>
      </BrowserRouter>
  );
};

export default App;
