# CurrencyConverter

CurrencyConverter is a Kotlin library that allows developers to integrate currency conversion functionality into their Android applications. It uses ExchangeRate-API to fetch real-time exchange rates, providing an easy-to-use interface for converting between currencies.

## Features

- Fetches real-time exchange rates from ExchangeRate-API.
- Supports conversion between multiple currencies.
- Easy integration with Android applications using Retrofit.
- Callback mechanism for handling API responses efficiently.

## Configuration

To get started, you'll need to configure the API key in your project. You can set the API key dynamically using the following methods.

### API Key Setup

1. **Set API Key at Runtime**  
   You can configure the API key dynamically using the `CurrencyConverterConfig` object. This allows you to inject your API key into your app securely.

```kotlin
// Set the API Key at runtime
CurrencyConverterConfig.setApiKey("YOUR_API_KEY")
