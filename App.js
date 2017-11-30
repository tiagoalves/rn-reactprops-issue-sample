import React from 'react';
import { StyleSheet, Text, View, requireNativeComponent } from 'react-native';


const SampleModule = requireNativeComponent('SampleModule', null);

export default class App extends React.Component {
  render() {

    const sample = <SampleModule
      // This crashes
      start={[0.0, 1.0]}
      // However, this works
      // startfoobar={[0.0, 1.0]}
    />;

    return (
      <View style={styles.container}>
        <Text>Open up App.js to start working on your app!</Text>
        <Text>Changes you make will automatically reload.</Text>
        <Text>Shake your phone to open the developer menu.</Text>
        { sample }
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
